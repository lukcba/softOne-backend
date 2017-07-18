import grails3.cors.interceptor.SpringSecurityCorsFilter
import org.springframework.boot.web.servlet.FilterRegistrationBean

beans = {
    securityCorsFilter(SpringSecurityCorsFilter)

    myFilterDeregistrationBean(FilterRegistrationBean) {
        filter = ref('securityCorsFilter')
        enabled = false
    }
}