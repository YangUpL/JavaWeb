<script type="module" setup>
  //引入模块
  import { reactive,computed} from 'vue'
  const author = reactive({
    name: 'John Doe',
    books: [
      'Vue 2 - Advanced Guide',
      'Vue 3 - Basic Guide',
      'Vue 4 - The Mystery'
    ]
  })
  // 一个计算属性 ref
  const publishedBooksMessage = computed(() => {
    console.log("publishedBooksMessage")
    return author.books.length > 0 ? 'Yes' : 'No'
  })
  // 一个函数
  let hasBooks = ()=>{
    console.log("hasBooks")
    return author.books.length > 0?'Yes':'no'
  }

</script>

<template>
  <div>
    <p>{{author.name}} Has published books?:</p>
    <span>{{ author.books.length > 0 ? 'Yes' : 'No' }}</span>
    <span>{{ hasBooks() }}</span><!-- 调用方法,每个标签都会调用一次 -->
    <span>{{ hasBooks() }}</span>

    <p>{{author.name}} Has published books?:</p>
    <span>{{ publishedBooksMessage }}</span><!-- 属性计算,属性值不变时,多个个标签只会调用一次 -->
    <span>{{ publishedBooksMessage }}</span>
  </div>
</template> 

<style scoped>
</style>
