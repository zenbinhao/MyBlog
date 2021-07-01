<template>
  <el-container class="blog-box">
    <el-header class="blog-header" height="120px">
      <h1 class="blog-header-h1">记录1</h1>
      <p>
        <i class="el-icon-user"></i>
        <span>zeng</span>
        <i class="el-icon-time"></i>
        <span>2020年6月30日</span>
        <i class="el-icon-view"></i>
        <span>100次浏览</span>
        <i class="el-icon-chat-round"></i>
        <span>4条评论</span>
        <i class="el-icon-edit"></i>
        <span>190个字</span>
      </p>
      <p>
        <span>#</span>
        生活点滴
      </p>
    </el-header>
    <el-main class="bolog-main">
      <div class="bolog-main-share">
        <p>
          <i class="el-icon-house"></i>
          <a href="">首页</a>
          / 正文
        </p>
        <p>
          分享:
          <i class="el-icon-share"></i>
        </p>
      </div>
      <div class="bolog-main-context">
        <div class="context-body">
          <!-- <p>
            由于阿里云的老版学生机突然没了，而我正好到期了，好多东西也就停了，因为我大多东西都在阿里的学生机上，好多域名备案也是在阿里的学生机上。现在东西应该备份的差不多了，这段时间迁过来叭，难受咯。图床，皮肤站，各种单页，还有别人在我这儿挂的一些网站。啊淦！博客不受影响，希望腾讯云也别搞这些.
            <br>
            <br>
            我还发现好多友链也没了...估计也没发现
          </p> -->

          <p data-v-f77780d6="">初始化的内容</p><p data-v-f77780d6="">初始化的内容</p><pre><code class="Java"><span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">HelloWorld</span> {
              <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-built_in">void</span> <span class="hljs-title function_">main</span>(<span class="hljs-params"><span class="hljs-built_in">String</span>[] args</span>){
                  <span class="hljs-title class_">System</span>.<span class="hljs-property">out</span>.<span class="hljs-title function_">println</span>(<span class="hljs-string">"Hello World!"</span>);
              }
          }</code></pre>
        </div>
        <div class="bolog-main-context-foot">
          <p>
            <i class="el-icon-time"></i>
            <span>最后修改：2021 年 06 月 30 日 00 : 07 AM</span>
          </p>
          <p>
            &copy;允许转发
          </p>
        </div>
        <div class="bolog-main-context-pay">
           <button>
             <i class="el-icon-ice-cream-round"></i>
             发电
           </button>
           <p>如果觉得我的文章对你有用，请插好眼~</p>
        </div>
      </div>
      <div class="bolog-router">
        <button>上一篇</button>
        <button>下一篇</button>
      </div>
      <div class="bolog-comment">
        评论区待开发
      </div>
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
.blog-box{
  .blog-header{
    text-align: center;
    background-color: #f9f9f9;
    padding: 20px 0;
    .blog-header-h1{
      font-size: 25px;
      font-weight: 200;
      padding: 0 0 10px;
    }
    p{
      font-size: 13px;
      font-weight: 400;
      color: #a0a0a0;
      margin-bottom: 5px;
    }
    span{
      margin: 0 5px 0 0;
      font-size: 10px;
    }
  }
  .bolog-main{
    .bolog-main-share{
      border-radius: 5px 5px;
      background-color: white;
      display: flex;
      align-items: center;
      justify-content: space-between;
      p{
        font-size: 14px;
        font-weight: 400;
        padding: 10px 10px;
      }
    }
    .bolog-main-context{
      margin-top: 20px;
      background: white;
      padding: 30px;
      p{
        font-size: 14px;
        color: #777;
        line-height: 25px;
      }
      .bolog-main-context-foot{
        margin: 30px 0;
        display: flex;
        align-items: center;
        justify-content: space-between;
        p{
          font-size: 12px;
        }
      }
      .bolog-main-context-pay{
        text-align: center;
        button{
          border-radius: 5px;
          border: none;
          padding: 5px 15px;
          font-size: 16px;
          color: white;
          background-color: #c0a46b;
          cursor: pointer;
        }
        p{
          margin: 20px 0 0;
          font-size: 12px;
        }
      }
      .context-body{
        color:#ff9900;
        /* table 样式 */
        table {
          border-top: 1px solid #ccc;
          border-left: 1px solid #ccc;
        }
        table td,
        table th {
          border-bottom: 1px solid #ccc;
          border-right: 1px solid #ccc;
          padding: 3px 5px;
        }
        table th {
          border-bottom: 2px solid #ccc;
          text-align: center;
        }

        /* blockquote 样式 */
        blockquote {
          display: block;
          border-left: 8px solid #d0e5f2;
          padding: 5px 10px;
          margin: 10px 0;
          line-height: 1.4;
          font-size: 100%;
          background-color: #f1f1f1;
        }

        /* code 样式 */
        code {
          display: inline-block;
          *display: inline;
          *zoom: 1;
          background-color: #000;
          border-radius: 3px;
          padding: 3px 5px;
          margin: 0 3px;
        }
        pre code {
          display: block;
        }

        /* ul ol 样式 */
        ul, ol {
          margin: 10px 0 10px 20px;
        }
      }
    }
    .bolog-router{
      margin: 30px 0;
      display: flex;
      align-items: center;
      justify-content: space-between;
      button{
        font-size: 14px;
        border: none;
        border-radius: 30%;
        padding: 8px 14px;
        background-color: white;
        &:hover{
          background-color:rgba(255,255,255,.5)
        }
      }
    }
    .bolog-comment{
      font-size: 16px;
      font-weight: 200;
    }
  }
}
</style>
