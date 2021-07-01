<template>
  <el-container class="pushBlog-box">
    <el-header class="pushBlog-header" height="80px">
      <h2>发表文章</h2>
    </el-header>
    <el-main class="pushBlog-main">
      <el-form label-width="50px" :model="BlogList">
        <el-form-item label="主题:">
          <el-input v-model="BlogList.title"></el-input>
        </el-form-item>
        <div id="div1">
              <p>初始化的内容</p>
              <p>初始化的内容</p>
        </div>
        <div class="pushBlog-main-button">
          <el-button type="warning">清空</el-button>
          <el-button type="success" @click="getAndPush()">提交</el-button>
        </div>
      </el-form>
    </el-main>

  </el-container>
</template>

<script>
  import hljs from 'highlight.js'
  import 'highlight.js/styles/monokai-sublime.css'
  import emojiJSON from '@/assets/data/emoji.json'
  import E from "wangeditor"
  export default {
    name: "",
    //数据存放
    data() {
      return {
        BlogList: {
          title: '',
          editorData: ''
        },
        editor: null,
      }
    },
    //方法函数存放
    methods: {
      getAndPush(){
        let data = this.editor.txt.html()
        this.BlogList.editorData = data
        // alert(data)
        console.log(this.BlogList)
      },
      beforeDestroy() {
        // 调用销毁 API 对当前编辑器实例进行销毁
        this.editor.destroy()
        this.editor = null
      }
    },
    //页面加载时
    mounted() {
      const editor = new E("#div1")
      // 配置 onchange 回调函数，将数据同步到 vue 中
      editor.config.onchange = (newHtml) => {
         this.BlogList.editorData = newHtml
      }
      editor.config.emotions = [
          {
              // tab 的标题
              title: '默认',
              // type -> 'emoji' / 'image'
              type: 'image',
              // content -> 数组
              content: emojiJSON
          },
              {
                  title: 'emoji',  // tab 的标题
                  type: 'emoji', // 'emoji' / 'image'
                  // emoji 表情，content 是一个数组即可
                  content: '😀 😃 😄 😁 😆 😅 😂 😊 😇 🙂 🙃 😉 😓 😪 😴 🙄 🤔 😬 🤐'.split(/\s/),
              }
      ]
      editor.highlight = hljs

      editor.create()
      this.editor = editor

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
.pushBlog-box{
  .pushBlog-header{
    background-color: #f9f9f9;
    text-align: center;
    h2{
      font-size: 30px;
      font-weight: 300;
      padding: 20px 0;
    }
  }
  .pushBlog-main{
    .pushBlog-main-button{
      margin: 20px 0;
      display: flex;
      align-items: center;
      justify-content: space-between;
    }
  }
}
</style>
