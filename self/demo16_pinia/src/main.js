import { createApp } from 'vue'
import App from './App.vue'
import router from './routers/router.js'
// 导pinia
import { createPinia } from 'pinia'
// 创建pinia对象
let pinia= createPinia()

let app =createApp(App)
app.use(router)
// app中使用pinia功能
app.use(pinia) 
app.mount('#app')