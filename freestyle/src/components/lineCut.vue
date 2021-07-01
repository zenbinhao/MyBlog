<template>
      <div :class="this.styleList[this.count]"></div>
</template>

<script>
  export default {
    name: "",
    props: [
      "styleTo"
    ],
    //数据存放
    data() {
      return {
        styleList:["lineCut1","lineCut2"],
        count: this.$props.styleTo
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
    .lineCut1{
      z-index: 99;
      height: .5px!important;
      background-color: #222;
      margin: 5px 0;
      overflow: hidden;
      font-size: 0;
    }
    .lineCut2{
      height: .5px!important;
      background-color: rgba(237,241,242,.6);
      margin: 5px 0;
      overflow: hidden;
      font-size: 0;
    }
</style>
