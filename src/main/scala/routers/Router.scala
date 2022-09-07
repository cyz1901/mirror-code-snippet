package routers

import pages.HomePage
import japgolly.scalajs.react.extra.router._

object Router {
  sealed trait AppPage
  case object Home extends AppPage
  val routerConfig = RouterConfigDsl[AppPage].buildConfig { dsl =>
    import dsl._
    (
      trimSlashes |
        staticRoute(root, Home) ~> renderR(ctl => (HomePage(ctl)))
    ).notFound(redirectToPage(Home)(SetRouteVia.HistoryReplace))
  }
}
