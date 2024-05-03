const base = {
    get() {
        return {
            url : "http://localhost:8080/springclouddze3k/",
            name: "springclouddze3k",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springclouddze3k/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "房产销售平台"
        } 
    }
}
export default base
