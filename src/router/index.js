//引入Vue-router路由依赖
import { createRouter, createWebHistory } from "vue-router"
import UserMan from "@/components/UserMan";

//定义路由设置，注意这里是一个数组
const routes = [
    //每一个链接都是一个对象
    {
        //path表示链接路径，这里把默认的8081设置链接到HelloWorld.vue组件
        path: '/',
        //访问localhost:8081时会自动跳转到/home
        // redirect:'/home',
        name: 'UserMan',
        component: UserMan
    }
]

//定义路由配置，注意export导出，只有导出了别的文件才能import导入
export const router = createRouter({
    //createWebHistory路由模式路径不带#号,createWebHashHistory路由模式路径带#号，而且默认是Hash
    history: createWebHistory(),
    routes: routes
})

export default router