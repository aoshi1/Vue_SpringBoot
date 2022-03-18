<template>
  <div id="app">
    <!--在这里显示组件-->
    <router-view/>
  </div>
</template>

<script>
import UserMan from "@/components/UserMan";

export default {
  name: 'App',
  components: {
    // eslint-disable-next-line vue/no-unused-components
    UserMan
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
