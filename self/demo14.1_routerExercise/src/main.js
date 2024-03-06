import { createApp } from 'vue'
import App from './App.vue'
import router from "./routes/router.js"
let app = createApp(App)

app.use(router)
app.mount('#app')
