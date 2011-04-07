package net.sourceforge.ls4

/**
 * Created by IntelliJ IDEA.
 * User: takeshita
 * Date: 11/04/07
 * Time: 12:15
 * To change this template use File | Settings | File Templates.
 */

class StoredObject{

  var data : Array[Byte] = null
  var attributes : Map[String,String] = Map.empty

  def find_? = data != null && attributes != null

}