<template>
  <div class="head-mobile-box">
      <p>
        <i class="el-icon-loading" @click="openAside()"></i>
      </p>
      <img src="../assets/img/xly.gif" alt="">
      <p>
        <i class="el-icon-search"></i>
      </p>
  </div>
</template>

<script>
  export default {
    name: "",
    //数据存放
    data() {
      return {
        isAside:0,
      }
    },
    //方法函数存放
    methods: {
      openAside(){
        if(this.isAside===1){
          //让父组件关闭左边栏
          this.isAside = 0
          this.$emit("updateAsideStyle",this.isAside)
        }else{
          //让父组件弹出左边栏
          this.isAside = 1
          this.$emit("updateAsideStyle",this.isAside)
        }
      },
      parallel(value){
        this.isAside = value
      }
    },
    //页面加载时
    mounted() {

    },
    //组件注册
    components: {

    },
    //自定义函数
    directives:{

    },
    //过滤器
    filters:{
    //时间戳转换
      formatDate(obj){
        return  new Date(obj).toLocaleString().replace(/:\d{1,2}$/,' ');
      }
    },
    //计算机属性对象
    computed:{

    },
    //侦听属性
    watch:{

    }
  }
</script>

<style lang="scss" scoped="scoped">
.head-mobile-box{
  display: flex;
  align-items: center;
  justify-content: space-between;
  img{
    height: 50px;
  }
  p{
    color: white;
    i{
      cursor: pointer;
    }
  }
}
</style>
