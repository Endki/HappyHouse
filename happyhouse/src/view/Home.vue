<template>
  <div id="app">
    <Header/>
    <Middle/>
    <Footer/>
  </div>
</template>

<script>
import Header from './header.vue'
import Middle from './middle.vue'
import Footer from './footer.vue'
export default {
  name: 'App',
  components: {
    Header,
    Middle,
    Footer
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
