var app2 = new Vue({
  el: '#app-2',
  data: {
    message: 'You loaded this page on ' + new Date().toLocaleString()
  }
})
var app3 = new Vue({
  el: '#app-3',
  data: {
    seen: true
  }
})
Vue.component('todo-item', {
  props: ['todo'],
  template: '<li>{{ todo.text }}</li>'
})

var app7 = new Vue({
  el: '#app-7',
  data: {
    groceryList: [
      { id: 0, text: 'Fries' },
      { id: 1, text: 'Fish' },
      { id: 2, text: 'Whatever else humans are supposed to eat' }
    ]
  }
})
Vue.component('todo-item', {
  .
  props: ['todo'],
  template: '<li>{{ todo.text }}</li>'

              <div id="app">
  <p>{{ message }}</p>
  <p><input v-model="message"></p>
</div>
new Vue({
  el: '#app',
  data: {
    message: "Laura is awesome!"
  },
  methods: {
    reverseMessage: function() {
      this.message = this.message.split('').reverse().join('')
    }
  }
})
Vue.createApp({
  data() {
    return {
      checkedNames: []
    }
  }
}).mount('#v-model-multiple-checkboxes')
Vue.createApp({
  data() {
    return {
      selected: ''
    }
  }
}).mount('#v-model-select')

Vue.component('child-component', {
  template: '#child-component',
  data() {
      return {
        childTitle: 'title from child component',
        childSubtitle: 'subtitle from child component'
      }
  },
  props:{
    subtitle: {
      type: String,
      required: true
    }
  }
})

new Vue ({
  el: '#app',
  data() {
      return {
        title: 'Hello Vue',
        subtitle: 'how to use slots'
    }
  }
})




                  
