package happygram.ecommerce.config;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalControllerAdvice {
    @ModelAttribute
	public void handleRequest(HttpServletRequest request, Locale locale, Model model) {
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
    }
}
