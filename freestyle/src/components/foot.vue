<template>
  <div class="index-footer">
    <p>&copy; 2021 Copyright | binhao.Zeng-Blog</p>
    <p>----------------备案----------------</p>
  </div>
</template>

<script>
  export default {
    name: "foot",
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
.index-footer{
  line-height: 50px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  p{
    font-size: 13px;
    color: #58666e;
  }
}
</style>
