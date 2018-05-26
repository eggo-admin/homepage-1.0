
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/brigita/Dev/test/homepage-1.0/conf/routes
// @DATE:Sat May 26 20:12:17 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
