<template>
  <div class="index-aside-box">
    <!-- logo区域放的-->
    <!-- <div class="aside-logo" onClick="location='https://github.com/zenbinhao'"> -->
      <!-- <svg t="1624875933759" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="7535"
        width="2rem" height="2rem">
        <path d="M512 0C229.283787 0 0.142041 234.942803 0.142041 524.867683c0 231.829001 146.647305 428.553077 350.068189 497.952484 25.592898 4.819996 34.976961-11.38884 34.976961-25.294314 0-12.45521-0.469203-45.470049-0.725133-89.276559-142.381822 31.735193-172.453477-70.380469-172.453477-70.380469-23.246882-60.569859-56.816233-76.693384-56.816234-76.693385-46.493765-32.58829 3.540351-31.948468 3.540351-31.948467 51.356415 3.71097 78.356923 54.086324 78.356923 54.086324 45.683323 80.19108 119.817417 57.072162 148.993321 43.593236 4.649376-33.91059 17.915029-57.029508 32.50298-70.167195-113.675122-13.222997-233.151301-58.223843-233.1513-259.341366 0-57.285437 19.919806-104.163095 52.678715-140.846248-5.246544-13.265652-22.820334-66.626844 4.990615-138.884127 0 0 42.996069-14.076094 140.760939 53.787741 40.863327-11.644769 84.627183-17.445825 128.177764-17.6591 43.465272 0.213274 87.271782 6.014331 128.135109 17.6591 97.679561-67.906489 140.59032-53.787741 140.59032-53.787741 27.938914 72.257282 10.407779 125.618474 5.118579 138.884127 32.844219 36.683154 52.593405 83.560812 52.593405 140.846248 0 201.586726-119.646798 245.990404-233.663158 258.957473 18.341577 16.208835 34.721032 48.199958 34.721032 97.210357 0 70.167195-0.639822 126.7275-0.639823 143.960051 0 14.033439 9.213443 30.370239 35.190235 25.209005 203.250265-69.527373 349.769606-266.123484 349.769605-497.867175C1023.857959 234.942803 794.673558 0 512 0"
          fill="#3E75C3" p-id="7536"></path>
      </svg> -->
<!--      <span class="font-color-w">
        &nbsp;&nbsp;Zeng
      </span> -->
    <!-- </div> -->
    <div class="logo-div">
      <img src="../assets/img/xly.gif">
    </div>
    <!--个人头像、座右铭  -->
    <div class="introduce-me">
      <img src="@/assets/img/touxiang.jpg" />
      <div>
        <p class="font-color-w">Pogarmer.Z</p>
        <p class="font-color-g">脚踏实地</p>
      </div>
    </div>
    <!-- 分割线 -->

    <div class="aside-nav font-color-g" v-for="(key,index) in toList" :key="index">
      <LineCut styleTo="0"></LineCut>
      <ul>
        <li>{{key.navTitle}}</li>
      </ul>
      <a v-for="(k,i) in key.navList" :key="i" class="font-color-g" @click="routerTo(i)">
        <img :src="k.i">
        {{k.t}}
      </a>
    </div>
  </div>
</template>

<script>
  import LineCut from '@/components/lineCut.vue'
  export default {
    name: "",
    //数据存放
    data() {
      return {
        toList: [
          {
            navTitle: "导航",
            navList:[
              {
              t: "首页",
              i: require("@/assets/img/n2.png")
            },{
              t: "博客文章",
              i: require("@/assets/img/n5.png")
            },{
              t: "时光机",
              i: require("@/assets/img/n4.png")
            },{
              t: "留言板",
              i: require("@/assets/img/n1.png")
            }]
          },
          {
            navTitle: "更多",
            navList:[
              {
              t: "关于我",
              i: require("@/assets/img/n6.png")
            },{
              t: "友情链接",
              i: require("@/assets/img/n3.png")
            }]
          }
        ],
        routerList:["/daily","/blog","/pushBlog"]
      }
    },
    //方法函数存放
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      },
      routerTo(index){
        this.$router.push(this.routerList[index])
      }
    },
    //页面加载时
    mounted() {

    },
    //组件注册
    components: {
LineCut,
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

    }
  }
</script>

<style lang="scss">
  .index-aside-box {
    width: 100%;
    height: 100%;
    font-size: 12px;
    display: flex;
    flex-direction:column;
    position: relative;
    // .aside-logo {
    //   display: flex;
    //   align-items: center;
    //   justify-content: center;
    //   width: 100%;
    //   height: 50px;
    //   background-size: 100% 100%;
    //   line-height: 50px;
    //   span{
    //     font-size: 14px;
    //     font-weight: 600;
    //   }
    // }
    .logo-div{
      z-index: 1;
      text-align: center;
      width: 100%;
      height: 50px;
      img{
        width: auto;
        height: 100%;
      }
    }
    .introduce-me {
      width: 100%;
      height: 80px;
      display: flex;
      align-items: center;
      justify-content: center;
      margin: 10px 0;
      img {
        width: 60px;
        border-radius: 50% 50%;
        margin-right: 20px;
        box-shadow: 2px 1.5px 3px #e1e1e1;
      }
      div{
        p{
          text-align: center;
          &:nth-child(1){
            font-weight: 600;
          }
        }
      }
    }
    .aside-nav{
      font-size: 12px;
      font-weight: 200;
      ul{
        li{
          width: 200px;
          padding: 10px 10px;
        }
      }
      a{
        display: block;
        font-size: 14px;
        padding: 10px 20px 10px;
        display: flex;
        align-items: center;
        justify-content: flex-start;
        background-color: #000;
        &:hover{
          z-index: 9999;
          background-color: rgba(222,12,17,0.1);
          cursor: pointer;
        }
        img{
          margin-right: 20px;
          height: 18px;
          width: 18px;
        }
      }
    }
  }
</style>
