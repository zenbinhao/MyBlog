<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App',
  mounted () {
    // 页面启动时动态获取当前页面的的屏幕宽度大小
    // 给予fontsize动态数据进行页面响应式布局
    // const htmlSize = document.documentElement.clientWidth || document.body.clientWidth
    // const dom = document.getElementsByTagName('html')[0]
    // dom.style.fontSize = htmlSize / 100 + 'px'
    // window.addEventListener('resize', function (e) {
    //   const htmlSize = document.documentElement.clientWidth || document.body.clientWidth
    //   dom.style.fontSize = htmlSize / 100 + 'px'
    // })
  }
}
</script>

<style lang="scss">
@import '@/assets/scss/base.scss';
#app {
}
</style>
