<script setup type="module">
  const data = {
    name:'尚硅谷',
    url:"http://www.atguigu.com",
    logo:"http://www.atguigu.com/images/index_new/logo.png"
  }
</script>

<template>
  <div>
    <a 
      v-bind:href='data.url' 
      target="_self">
      <img 
        :src="data.logo" 
        :title="data.name">
      <br>
      <input type="button" 
             :value="`点击访问${data.name}`">
    </a>
  </div>
</template>

<style scoped>
</style>