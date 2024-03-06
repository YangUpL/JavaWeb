<script type="module" setup>
    /* 从vue中引入reactive方法 */
    import {ref,reactive,toRef,toRefs} from 'vue'
    let data = reactive({
      counter:0,
      name:"test"
    })

    // 将一个reactive响应式对象中的某个属性转换成一个ref响应式对象
    let ct =toRef(data,'counter');
    // 将一个reactive响应式对象中的多个属性转换成多个ref响应式对象
    let {counter,name} = toRefs(data)

    function show(){
        alert(data.counter);
        // 获取ref的响应对象,需要通过.value属性
        alert(counter.value);
        alert(name.value)
    }
    /* 函数中要操作ref处理过的数据,需要通过.value形式 */
    let decr = () =>{
      data.counter--;
    }
    let incr = () =>{
      /* ref响应式数据,要通过.value属性访问 */
      counter.value++;
    }
</script>

<template>
  <div>
    <button @click="data.counter--">-</button> 
    <button @click="decr()">-</button> 
    {{ data.counter }} 
    &amp;
    {{ ct }} 
    <button @click="data.counter++">+</button>
    <button @click="incr()">+</button> 
    <hr>
    <button @click="show()">显示counter值</button>
   </div>
</template> 

<style scoped>

</style>

