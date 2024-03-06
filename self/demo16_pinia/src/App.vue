<script setup type="module">

  
</script>

<template>
    <div>
      <hr>
      <router-link to="/opearte">显示操作页</router-link> <br>
      <router-link to="/list">显示展示页</router-link> <br>
      <hr>
      <router-view></router-view>
      <router-view name="list"></router-view>
      
    </div>
</template>

<style scoped>
</style>