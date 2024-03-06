// 导入路由创建的相关方法
import {createRouter,createWebHashHistory} from 'vue-router'

// 导入vue组件
import List  from '../components/List.vue'
import Operate  from '../components/Operate.vue'
// 创建路由对象,声明路由规则
const router = createRouter({
    history: createWebHashHistory(),
    routes:[
        {
            path:'/list',
            component:List
        },
        
        {
            path:'/opearte',
            components:{
                class:Operate,
                list:List
            }
        },
        
        {
            path:'/',
            component:Operate
        },
    ]

})

// 对外暴露路由对象
export default router;