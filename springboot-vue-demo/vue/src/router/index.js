import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'index',
    component: () => import('../views/index.vue')
  },
  {
    path: '/home',
    name: 'Home',
    component: () => import('../views/Home.vue')
  },
  {
    path: '/registered',
    name: 'registered',
    component: () => import('../views/registered.vue')
  },
  {
    path: '/my_class',
    name: 'my_class',
    component: () => import('../views/my_class.vue')
  },
  {
    path: '/classchg',
    name: 'classchg',
    component: () => import('../views/classchg.vue')
  },
  {
    path: '/addadm',
    name: 'addadm',
    component: () => import('../views/addadm.vue')
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

// 跨域配置
// module.exports = {
//   devServer: {                //记住，别写错了devServer//设置本地默认端口  选填
//     port: 9876,
//     proxy: {                 //设置代理，必须填
//       '/api': {              //设置拦截器  拦截器格式   斜杠+拦截器名字，名字可以自己定
//         target: 'http://localhost:9090',     //代理的目标地址
//         changeOrigin: true,              //是否设置同源，输入是的
//         pathRewrite: {                   //路径重写
//           '/api': ''                     //选择忽略拦截器里面的单词
//         }
//       }
//     }
//   }
// }


export default router
