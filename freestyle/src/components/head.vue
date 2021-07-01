<template>
  <div class="head-box">
    <div class="head-box-l">
      <span class="head-box-l-chart">
        <img src="../assets/img/tubing.png" alt="">
        <img src="../assets/img/right.png" alt="">
      </span>
      <span class="head-box-l-inp">
        <input type="text" placeholder="输入关键字回车即可..." v-model="input">
        <img src="../assets/img/search.png" alt="">
      </span>
    </div>
    <div class="head-box-r">
      <!-- <img src="../assets/img/xly.gif" alt=""> -->

      <span>{{this.xsg_time | formatDate}}</span>
        <img src="../assets/img/github.png" alt="进入我的github" onClick="location='https://github.com/zenbinhao'">
    </div>
  </div>
</template>

<script>
  export default {
    //数据存放
    data() {
      return {
        input: "",
        screenIs: true,
        xsg_time: "",
      }
    },
    //方法函数存放
    methods: {
      xsg() {
        var timestamp = Date.parse(new Date())
        this.xsg_time = timestamp
      }
    },
    //页面加载时
    mounted() {
      this.xsg_time = Date.parse(new Date())
      setInterval(this.xsg, 1000)
    },
    //组件注册
    components: {

    },
    //自定义函数
    directives: {

    },
    //过滤器
    filters: {
      //时间戳转换
      formatDate(obj) {
        return new Date(obj).toLocaleString().replace(/:\d{1,2}$\s/, ' ');
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

<style lang="scss" scoped="scoped">
  .head-box {
    width: 100%;
    height: 100%;
    display: flex;
    align-items: center;
    justify-content: space-between;

    .head-box-l {
      display: flex;
      align-items: center;

      .head-box-l-chart {
        cursor: pointer;
        display: flex;
        align-items: center;
        margin-right: 20px;

        img:nth-child(1) {
          width: 18px;
          margin-right: 4px;
        }

        img:nth-child(2) {
          width: 8px;
          transition: all 0.5s;
        }

        &:hover img:nth-child(2) {
          transform: rotate(90deg);
        }
      }

      .head-box-l-inp {
        display: flex;
        align-items: center;
        border-radius: 30% 0;
        background-color: rgba(255, 255, 255, 0.8);
        border: 2px solid #fff;
        padding: 3px 1px 3px 10px;

        input {
          font-size: 12px;
          border: none;
          z-index: 99;
          background-color: rgba(255, 255, 255, 0.8);

          &:hover {
            background-color: rgba(255, 255, 255, 0.4);
          }

          &::-webkit-input-placeholder {
            color: #a0a0a0;
          }
        }

        &:hover {
          // background-color: rgba(255,255,255,0.4);
          border: 2px solid #3967FF;
        }

        img {
          padding: 4px;
        }
      }
    }

    .head-box-r {
      // background-color: #000;
      width: 240px;
      text-align: center;
      height: 100%;
      display: flex;
      align-items: center;
      justify-content: space-between;

      div {
        display: flex;
        align-items: center;
        justify-content: center;
      }
       img{
         cursor: pointer;
       }
      // img{
      //   height: 100%;
      //   width: 200px;
      //   background-size: 100% 100%;
      // }
    }
  }
</style>
