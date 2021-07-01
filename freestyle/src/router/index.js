import Vue from 'vue'
import Router from 'vue-router'
import register from '@/view/register'
import login from '@/view/login'
import index from '@/view/index'
import daily from '@/view/lv2page/daily'
import blog from '@/view/lv2page/blog'
import pushBlog from '@/view/lv2page/pushBlog'

Vue.use(Router)
const routerPush = Router.prototype.push
Router.prototype.push = function push (location) {
  return routerPush.call(this, location).catch(error => error)
}
export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: index,
      redirect: {name: 'daily'},
      children: [
        {
        path: '/daily',
        name: 'daily',
        component: daily,
        },
        {
          path: '/blog',
          name: 'blog',
          component: blog,
        },
        {
          path: '/pushBlog',
          name: 'pushBlog',
          component: pushBlog,
        },
        
      ]
    },
    {
      path: '/login',
      name: 'login',
      component: login
    },
    {
      path: '/register',
      name: 'register',
      component: register
    }
  ]
})
