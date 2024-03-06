// 导入路由创建的相关方法
import {createRouter,createWebHashHistory} from 'vue-router'

// 导入vue组件
import Home from '../components/Home.vue'
import List from '../components/List.vue'
import Add from '../components/Add.vue'
import Update from '../components/Update.vue'
import ShowDetails from '../components/ShowDetails.vue'
import ShowDetails2 from '../components/ShowDetails2.vue'

// 创建路由对象,声明路由规则
const router = createRouter({
    history: createWebHashHistory(),
    routes:[

        {
            path:'/',
            components:{
                default: Home,
                homeViev : Home
            } 
        },

        {
            path:'/home',
            components:{
                homeView : Home
            } 
        },

        {
            path:'/list',
            components:{
                listView : List
            } 
        },
        {
            path:'/showAll',
            // 重定向
            redirect :'/list'
        },
        {
            path:'/add',
            components:{
                addView:Add
            } 
        },
        {
            path:'/update',
            components:{
                updateView:Update
            }  
        },
        
        {
            /* 此处:id  :language作占位为路径的符 */
            path:'/showDetail/:id/:language',
            /* 动态路由传参时,根据该名字找到该路由 */
            name:'showDetails',
            components:{
                showDetailView:ShowDetails
            }  
        },
        {
            path:'/showDetails2',
            components:{
                showDetailView2:ShowDetails2
            }  
        },
    ]

})

// 对外暴露路由对象
export default router;