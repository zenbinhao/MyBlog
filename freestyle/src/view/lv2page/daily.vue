<template>
  <el-container class="daily-box">
    <el-header class="daily-header" height="100px">
      <h2>日常记录</h2>
      <p>一步一印，脚踏实地</p>
    </el-header>
    <el-main class="daily-main">
      <div class="daily-main-blog" v-for="(key,index) in dailyList" :key="index">
        <h3 @click="routerToBolog()" style="cursor: pointer;">记录1!</h3>
        <p>由于阿里云的老版学生机突然没了，而我正好到期了，好多东西也就停了，因为我大多东西都在阿里的学生机上，好多域名备案也是在阿里的学生机上。现在东西应该备份的差不多了，这段时间迁过来叭，难受咯。图床，皮肤站，各种单页，还有别人在我这儿挂的一些网站。啊淦！博客不受影响，希望腾讯云也别搞这些.</p>
        <LineCut styleTo="1"></LineCut>
        <div class="daily-main-blog-bottom">
          <span>
          <i class="el-icon-time"></i>
          2021 年 06 月 30 日
          </span>
          <span>
            <i class="el-icon-chat-dot-square"></i>
            已有3条评论
          </span>
        </div>
      </div>
    </el-main>
    </el-container>
</template>

<script>
  import LineCut from '@/components/lineCut.vue'
  export default {
    name: "",
    //数据存放
    data() {
      return {
        dailyList:[1,2,3,4,5]
      }
    },
    //方法函数存放
    methods: {
      routerToBolog(){
        this.$router.push("/blog")
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
.daily-box{
  .daily-header{
    padding: 0;
    background-color: #f9f9f9;
    padding: 20px 0;
    text-align: center;
    h2{
      font-weight: 300;
      font-size: 30px;
    }
    p{
      font-size: 13px;
      color: #a0a0a0;
      font-weight: 400;
    }
  }
  .daily-main{

    .daily-main-blog{
      margin: 20px auto;
      padding: 20px;
      width: auto;
      height: auto;
      background: white;
      border-radius: 5px 5px;
      h3{
        color: #555;
        text-align: center;
        font-size: 20px;
        font-weight: 400;
        margin-bottom: 15px;
      }
      p{
        text-indent: 30px;
        line-height: 25px;
        margin-bottom: 15px;
        color: #a0a0a0;
        font-size: 14px;
        overflow: hidden;
        //超3行省略
        text-overflow: ellipsis;
        display: -webkit-box;
        -webkit-line-clamp: 3;
        -webkit-box-orient: vertical;
      }
      .daily-main-blog-bottom{
        display: flex;
        align-items: center;
        justify-content: space-between;
        margin-top: 15px;
        font-size: 12px;
        color: #a0a0a0;
        span:nth-child(2){
          cursor: pointer;

        }
      }
    }
  }
}

</style>
