<template>
  <el-container class="right-nav-box">
    <el-header class="right-nav">
      <div>
        <i class="el-icon-magic-stick"></i>
      </div>
      <div>
        <i class="el-icon-chat-dot-round"></i>
      </div>
      <div>
        <i class="el-icon-share"></i>
      </div>
    </el-header>
    <el-main>

    </el-main>
  </el-container>
</template>

<script>
  export default {
    name: "",
    //数据存放
    data() {
      return {

      }
    },
    //方法函数存放
    methods: {

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
  .right-nav-box{

    .right-nav{
      display: flex;
      align-items: center;
      justify-content: space-between;
      div{
        height: 100%;
        line-height: 60px;
        text-align: center;
        width: 50px;
        border-bottom: 1px solid #f9f9f9;
        i{
          font-size: 20px;
        }
        &:hover{
          border-bottom: 1px solid #000000;
        }
      }
    }
  }
</style>
