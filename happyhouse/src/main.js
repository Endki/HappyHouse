import './assets/css/one-page-wonder.css'
import './assets/css/land_home.css'
// import './assets/css/dd.css'
// import './assets/css/one-page-wonder.scss'
import Vue from 'vue'
import App from './App.vue'
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'


Vue.use(BootstrapVue)
Vue.config.productionTip = false


new Vue({
  render: h => h(App),
}).$mount('#app')
