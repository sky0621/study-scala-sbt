package com.example

import java.util.Date
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

/**
  * Created by SS on 2016/06/02.
  */
class SampleServlet extends HttpServlet {

  override def doGet(req: HttpServletRequest, res: HttpServletResponse) = {
    val s = res.getOutputStream
    s.print("Hello! " + new Date().toString)
    s.flush()
  }

}
