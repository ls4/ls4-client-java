package net.sourceforge.ls4


import java.util.Map
import org.msgpack.rpc.Future
/**
 * Created by IntelliJ IDEA.
 * User: takeshita
 * Date: 11/04/07
 * Time: 12:51
 * To change this template use File | Settings | File Templates.
 */

trait LS4ClientInterface{

  def get(key: String): StoredObject

  def get_data(key: String): Array[Byte]

  def get_attrs(key: String): Map[String, String]

  def read(key: String, offset: Int, size: Int): Array[Byte]

  def gett(vtime: Int, key: String): StoredObject

  def gett_data(vtime: Int, key: String): Array[Byte]

  def gett_attrs(vtime: Int, key: String): Map[String, String]

  def readt(vtime: Int, key: String, offset: Int, size: Int): Array[Byte]

  def getv(vname: String, key: String): StoredObject

  def getv_data(vname: String, key: String): Array[Byte]

  def getv_attrs(vname: String, key: String): Map[String, String]

  def readv(vname: String, key: String, offset: Int, size: Int): Array[Byte]

  def add(key: String, data: Array[Byte], attributes: Map[String, String]): ObjectKey

  def add_data(key: String, data: Array[Byte]): ObjectKey

  def addv(vname: String, key: String, attributes: Map[String, String]): ObjectKey

  def addv_data(key: String, data: Array[Byte]): ObjectKey

  def delete(key: String): Boolean

  def deletet(vtime: Int, key: String): Boolean

  def deletev(vname: String, key: String): Boolean

  def remove(key: String): Boolean

  def update_attrs(key: String, attributes: Map[String, String]): ObjectKey

  def getd_data(okey: ObjectKey): Array[Byte]

  def readd(okey: ObjectKey, offset: Int, size: Int): Array[Byte]

  def getAsync(key: String): Future[StoredObject]

  def get_dataAsync(key: String): Future[Array[Byte]]

  def get_attrsAsync(key: String): Future[Map[String, String]]

  def readAsync(key: String, offset: Int, size: Int): Future[Array[Byte]]

  def gettAsync(vtime: Int, key: String): Future[StoredObject]

  def gett_dataAsync(vtime: Int, key: String): Future[Array[Byte]]

  def gett_attrsAsync(vtime: Int, key: String): Future[Map[String, String]]

  def readtAsync(vtime: Int, key: String, offset: Int, size: Int): Future[Array[Byte]]

  def getvAsync(vname: String, key: String): Future[StoredObject]

  def getv_dataAsync(vname: String, key: String): Future[Array[Byte]]

  def getv_attrsAsync(vname: String, key: String): Future[Map[String, String]]

  def readvAsync(vname: String, key: String, offset: Int, size: Int): Future[Array[Byte]]

  def addAsync(key: String, data: Array[Byte], attributes: Map[String, String]): Future[ObjectKey]

  def add_dataAsync(key: String, data: Array[Byte]): Future[ObjectKey]

  def addvAsync(vname: String, key: String, attributes: Map[String, String]): Future[ObjectKey]

  def addv_dataAsync(key: String, data: Array[Byte]): Future[ObjectKey]

  def deleteAsync(key: String): Future[Boolean]

  def deletetAsync(vtime: Int, key: String): Future[Boolean]

  def deletevAsync(vname: String, key: String): Future[Boolean]

  def removeAsync(key: String): Future[Boolean]

  def update_attrsAsync(key: String, attributes: Map[String, String]): Future[ObjectKey]

  def getd_dataAsync(okey: ObjectKey): Future[Array[Byte]]

  def readdAsync(okey: ObjectKey, offset: Int, size: Int): Future[Array[Byte]]
}