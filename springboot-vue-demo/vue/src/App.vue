<template>
  <div>
    <Header></Header>
    <div style="display:flex">
      <Aside_menu></Aside_menu>
      <router-view style="flex:1"/>
    </div>
  </div>
 
</template>

<style>

</style>

<script>
import Header from "@/components/Header";
import Aside_menu from "@/components/Aside_menu";

export default{
  name:"app",
  components:{
    Header,
    Aside_menu,
  }
}
</script>
