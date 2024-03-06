<script setup type="module">


    let normal = ()=>{
        let fun1 = () =>{
            console.log("fun1 invoked")
        }
        // 调用函数
        fun1()
        // 函数执行完毕,继续执行后续代码
        console.log("other code processon")
    }

    function setTimeout1(){
        // 设置一个2000毫秒后会执行一次的定时任务
        setTimeout(function (){
            console.log("setTimeout invoked")
        },2000)
        console.log("other code processon")
    }

    function promiser1(){
        let promise =new Promise(function(resolve,reject){
            console.log("promise do some code ... ...")
            //resolve("promise success")
            reject("promise fail")
        })
        console.log('other code1111 invoked')
        //2.获取回调函数结果  then在这里会等待promise中的运行结果,但是不会阻塞代码继续运行
        promise.then(
            function(value){console.log(`promise中执行了resolve:${value}`)},
            function(error){console.log(`promise中执行了reject:${error}`)}
        )
        // 3 其他代码执行   
        console.log('other code2222 invoked')
    }

    function promiser2(){
        let promise =new Promise(function(resolve,reject){
            console.log("promise do some code ... ...")
            // 故意响应一个异常对象
            throw new Error("error message")
        })
        console.log('other code1111 invoked')
        /* 
            then中的reject()的对应方法可以在产生异常时执行,接收到的就是异常中的提示信息
            then中可以只留一个resolve()的对应方法,reject()方法可以用后续的catch替换
            then中的reject对应的回调函数被后续的catch替换后,catch中接收的数据是一个异常对象
            */
        promise.then(
            function(resolveValue){console.log(`promise中执行了resolve:${resolveValue}`)}
            //,
            //function(rejectValue){console.log(`promise中执行了reject:${rejectValue}`)}
        ).catch(
            function(error){console.log(error)} 
        )
        console.log('other code2222 invoked')
    }

    


    

</script>

<template>

    <div>
        <input type="button" @click="normal()" value="normal"><br>
        <input type="button" @click="setTimeout1()" value="setTimeout"><br>
        <input type="button" @click="promiser1()" value="promiser1">
        <input type="button" @click="promiser2()" value="promiser2">
    </div>
</template>

<style scoped>
</style>
