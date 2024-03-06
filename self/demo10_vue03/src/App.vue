<script type="module" setup>
    import {ref} from 'vue'

        let counter = ref(1)

        function counterIncr(){
          counter.value++;
        }

        function counterDecr(){
          counter.value--
        }
</script>

<template>
  <div>
    <button @click="counterDecr">-</button>
    <!-- <span v-text="counter"></span> -->
    <!-- <span>{{counter}}</span> -->
    {{counter}}

    <button @click="counterIncr">+</button>
  </div>
  

</template>

<style scoped>

</style>
