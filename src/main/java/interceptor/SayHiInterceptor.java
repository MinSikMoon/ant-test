package interceptor;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SayHiInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("minsik in postHndle start =============");
		Collection<String> headers = response.getHeaderNames();
		for (String header : headers) {
			System.out.println("header : " + header + ", value : " + header);
		}
		System.out.println("minsik : let's open modelAndView");
		System.out.println("view name : " + modelAndView.getViewName());
		HashMap<String, Object> map = modelAndView.getModelMap();
		Set<String> mapKeys = map.keySet();
		for(String key : mapKeys) {
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
		System.out.println("end of postHandle ===============");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("minsik : in prehandle start ============");
		Enumeration<String> strArr = request.getParameterNames();
		while (strArr.hasMoreElements()) {
			String paramName = strArr.nextElement();
			System.out.println("parameter: " + paramName + ", value: " + request.getParameter(paramName));
		}
		return true;
	}

}
