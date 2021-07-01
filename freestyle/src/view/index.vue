<template>
  <div>
    <el-backtop style="color: #000000;"></el-backtop>
    <el-container class="index-box">
      <transition name="el-zoom-in-top">
        <el-aside :width="this.asideWidth" :class="this.asideClass" v-if="asideIs===1" v-show="asideIs===1">
          <IndexAside></IndexAside>
        </el-aside>
      </transition>
      <el-container>
        <el-header height="50px" class="index-header" v-if="styleBy===0">
          <Head :styleBy="styleBy"></Head>
        </el-header>
        <el-header height="50px" class="index-header1" v-else>
          <HeadMobile @updateAsideStyle="updateAsideStyle" ref="child"></HeadMobile>
        </el-header>
        <el-container :direction="isRange" :style="(this.asideIs===1 && this.switchIs)?'cursor: pointer;':''"  @click.native="switchIs ? closeAsideStyle(0):''">
          <!-- <el-container :direction="isRange"> -->
          <el-main class="index-main">
            <router-view></router-view>
          </el-main>
          <el-aside :width="rangeWidth" class="index-main-r">
            <MainR></MainR>
          </el-aside>
          </el-backtop>
        </el-container>

        <el-footer height="50px" class="index-footer">
          <Foot></Foot>
        </el-footer>
      </el-container>
    </el-container>
  </div>
</template>

<script>
  import HeadMobile from '@/components/head-mobile.vue'
  import Head from '@/components/head.vue'
  import Foot from '@/components/foot.vue'
  import IndexAside from '@/components/indexAside.vue'
  import MainR from '@/components/main-r.vue'
  export default {
    name: "",
    //数据存放
    data() {
      return {
        // 定义监听窗口的属性
        screenWidth: document.body.clientWidth,
        // 修改主体区和右边栏的排列方式以及宽度样式
        isRange: "horizontal",
        rangeWidth: "240px",

        //此属性为头部样式  切换  为0的时候默认为pc样式  为1的时候为移动端样式
        styleBy: 0,
        // 此属性为左边栏是否弹出
        asideIs: 1,

        //封装的左边栏俩个不同样式的对象数组
        asideClassList:[
          {
          //左边栏样式
          asideClass:  "index-aside",
          //左边栏宽度
          asideWidth: "220px",
          //弹出时 是否禁用滚动条
          overflow: "auto"
          },{
          asideClass: "index-aside-mobile",
          asideWidth: "80%",
          overflow: "hidden"
          },
          ],
          switchIs: false,
      }
    },
    //方法函数存放
    methods: {
      //让移动端适配后的子组件  调节样式的方法  弹出左边导航
      updateAsideStyle(value){
        //让左边栏弹出
        this.asideIs = value
        if(value===1){
          this.switchIs = true
          this.changeAsideStyle(1)
        }else{
          this.switchIs = false
          this.changeAsideStyle(0)
        }
      },
      closeAsideStyle(value){
          this.asideIs = value

          this.changeAsideStyle(0)
          this.switchIs= false
          //把子组件向父组件请求切换样式的数据更新
          this.$refs.child.parallel(value)

      },

      //封装样式的切换  减少冗余代码
      changeAsideStyle(styleIndex){
        // 索引1为pc样式  索引2为移动端样式
        let list = this.asideClassList[styleIndex];
        this.asideClass = list.asideClass;
        this.asideWidth = list.asideWidth;
        document.body.parentNode.style.overflow = list.overflow
      },
      //让浏览器持续监听  窗口宽度的变化
      refresh(){
        const that = this;
        window.onresize = () => {
          window.screenWidth = document.body.clientWidth;
          that.screenWidth = window.screenWidth;
        }
      }
    },
    //页面加载时
    mounted() {
      this.refresh()
    },
    //组件注册
    components: {
      Head,
      IndexAside,
      Foot,
      HeadMobile,
      MainR,
    },
    //自定义函数
    directives: {

    },
    //过滤器
    filters: {
      //时间戳转换
      formatDate(obj) {
        return new Date(obj).toLocaleString().replace(/:\d{1,2}$/, ' ');
      }
    },
    //计算机属性对象
    computed: {

    },
    //侦听属性
    watch: {
      screenWidth: {
        immediate: true,
        handler: function (newVal) {
          // console.log(newVal)
          // console.log(this.asideIs)
          //  防止在弹出左边栏的时候  分辨率变化导致样式乱  初始化左边栏的样式
          this.changeAsideStyle(0)


          //进入移动端模式
          if(newVal<=770){
            //隐藏左边栏
            this.asideIs = 0
            if(this.switchIs){
              this.$refs.child.parallel(0)
              this.switchIs=false
            }
            //打开头部样式
            this.styleBy = 1
          }else{
            this.asideIs = 1
            this.styleBy = 0
          }

          //超过990分辨率模式
          if(newVal<=990){
            //  控制主体内容 和 左边栏的排列方式   以及变化的样式改变
            this.isRange= "vertical"
            this.rangeWidth = "100%"

          }else{
            //低于990分辨率模式
            //  控制主体内容 和 左边栏的排列方式   以及变化的样式改变
            this.isRange = "horizontal"
            this.rangeWidth = "240px"
            this.styleBy = 0
          }
        }
      }
    }
  }
</script>

<style lang="scss" scoped="scoped">
  .index-box{
    .index-aside {
      position: relative;
      background: #000;
    }
    .index-aside-mobile{
      height: calc(100vh);;
      background: #000;
      position: absolute;
    }
    // @media screen and (max-width: 770px) {
    //   .index-aside {
    //     display: none;
    //   }
    // }
    .index-header{
      z-index: 1;
      box-shadow: 0 1px 4px 1px rgba(0,0,0,0.05);
      background: #f9f9f9;
      padding-right: 0;
    }
    .index-header1{
      z-index: 1;
      background: #000;
    }
    .index-main {
      width: 100%;
      padding: 0;
      background-color: #f1f3f4;
    }
    .index-main-r{
      background: #f9f9f9;
    }
    .index-footer{
      background: #f9f9f9;
    }
  }

</style>
