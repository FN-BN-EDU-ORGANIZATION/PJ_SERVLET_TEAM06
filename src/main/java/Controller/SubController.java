package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SubController   {

	// 1 Select , 2 Insert , 3 Update , 4 Delete
	void execute(HttpServletRequest req,HttpServletResponse resp);

} 