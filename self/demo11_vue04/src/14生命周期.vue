<script setup>

    import {ref,onBeforeMount,onUpdated,onMounted,onBeforeUpdate} from 'vue'
    
    let message =ref('hello')
   
    onBeforeMount(() => {
        console.log('-----------onBeforeMount---------')
        let span1 =document.getElementById("span1")
        console.log(span1)
    })
      
    
    // 挂载完毕生命周期
    onMounted(()=>{
      console.log('-----------onMounted---------')
      let span1 =document.getElementById("span1")
      console.log(span1.innerText)
    })
    // 更新前生命周期
    onBeforeUpdate(()=>{
      console.log('-----------onBeforeUpdate---------')
      console.log(message.value)
      let span1 =document.getElementById("span1")
      console.log(span1.innerText)
    })
    // 更新完成生命周期
    onUpdated(()=>{
      console.log('-----------onUpdated---------')
      let span1 =document.getElementById("span1")
      console.log(span1.innerText)
    })
</script>

<template>
  <div>
    <span id="span1" v-text="message"></span> <br>
    <input type="text" v-model="message">
  </div>
  
</template>

<style scoped>
</style>