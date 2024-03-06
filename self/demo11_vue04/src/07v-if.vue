<script type="module" setup>
    import {ref} from 'vue'
    let awesome = ref(true)
</script>

<template>
  <div>
    <h1 v-if="awesome">Vue is awesome!</h1>
    <h1 v-else>Oh no 😢</h1>
    <button @click="awesome = !awesome">Toggle</button>
  </div>
</template> 

<style scoped>
</style>