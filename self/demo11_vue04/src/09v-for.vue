<script type="module" setup>
    import {ref,reactive} from 'vue'
    let parentMessage= ref('产品')
    let items =reactive([
      {
        id:'item1',
        message:"薯片"
      },
      {
        id:'item2',
        message:"可乐"
      }
    ])
</script>

<template>
  <div>
    <ul>
      <!-- :key不写也可以 -->
      <li v-for='item in items' :key='item.id'>
        {{ item.message }}
      </li>
    </ul>

    <ul>
      <!-- index表示索引,当然不是非得使用index这个单词 -->
      <li v-for="(item, index) in items" :key="index">
        {{ parentMessage }} - {{ index }} - {{ item.message }}
      </li>
    </ul>
   
  </div>
</template> 

<style scoped>
</style>