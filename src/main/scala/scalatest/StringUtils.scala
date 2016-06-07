package scalatest

/**
  * Created by SS on 2016/06/08.
  */
object StringUtils {

  def isEmpty(value: String): Boolean = value == null || value.length == 0
}
