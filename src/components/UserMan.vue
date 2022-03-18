<template>
  <div>
    <table>
      <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
      </tr>
      <!--遍历数据-->
      <tr v-for="item in users" :key="item.id">
        <td>{{item.id}}</td>
        <td>{{item.username}}</td>
        <td>{{item.password}}</td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: "UserMan",
  data:function(){
    return{
      users:[
        {
          id:1,
          username:'user',
          password:'123456'
        },
        {
          id:2,
          username:'admin',
          password:'123456'
        },
        {
          id:3,
          username:'yanao',
          password:'123456'
        }
      ]
    }
  },
  created() {
    this.$axios.get('/api')
        .then(resp=>{
          this.users=resp.data; //后端数据传给users数组
        })
  }
}
</script>

<style scoped>

</style>