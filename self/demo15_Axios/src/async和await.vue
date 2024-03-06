<script setup type="module">
   
        async function fun1(){
                  //return 10
                  //throw new Error("something wrong")
                  let promise = Promise.reject("heihei")
                  return promise
        }

        function async1(){
          let promise =fun1()

          promise.then(
              function(value){
                  console.log("success:"+value)
              }
          ).catch(
              function(value){
                  console.log("fail:"+value)
              }
          )
        }






	async function fun2(){
            return 10    
    }

    let res = 0;
      async function await1(){
          try{
              
              res = await fun2()
              //let res = await Promise.reject("something wrong")
          }catch(e){
              console.log("catch got:"+e)   
          }
          
          console.log("await got:"+res)
      }
</script>

<template>
    <div>
      <button  @click="async1()">async1</button>
      <hr>
      <button  @click="await1()">await1</button>
    </div>
</template>

<style scoped>
</style>
