// @GENERATOR:play-routes-compiler
// @SOURCE:/home/enos/projects/coletorws/conf/routes
// @DATE:Wed Jun 19 16:28:57 BRT 2019


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
