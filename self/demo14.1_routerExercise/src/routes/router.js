// 导入路由创建的相关方法
import {createRouter,createWebHashHistory} from 'vue-router'

// 导入vue组件

import Home from '../components/Home.vue'
import Login from '../components/login.vue'
// 创建路由对象,声明路由规则
const router = createRouter({
    history: createWebHashHistory(),
    routes:[
        {
            path:'/home',
            component:Home
        },
        {
            path:'/',
            redirect:"/home"
        },
        {
            path:'/login',
            component:Login
        },
    ]

})

// 设置路由的全局前置守卫
router.beforeEach((to,from,next)=>{
    /* 
        to 要去那
        from 从哪里来
        next 放行路由时需要调用的方法,不调用则不放行
    */
    console.log(`从哪里来:${from.path},到哪里去:${to.path}`)

    if(to.path == '/login'){
        //放行路由  注意放行不要形成循环  
        next()
    }else{
        //let username =window.sessionStorage.getItem('username'); 
        let username =window.localStorage.getItem('username'); 
        if(null != username){
            next()
        }else{
            next('/login')
        }

    }
})
// 设置路由的全局后置守卫
router.afterEach((to,from)=>{
    console.log(`从哪里来:${from.path},到哪里去:${to.path}`)
})

// 对外暴露路由对象
export default router;