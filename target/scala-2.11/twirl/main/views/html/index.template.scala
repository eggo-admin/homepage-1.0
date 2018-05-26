
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.19*/("""

"""),_display_(/*4.2*/main("Eggo")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""

    """),_display_(/*6.6*/play20/*6.12*/.welcome(message, style = "Java")),format.raw/*6.45*/("""

""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat May 26 20:12:18 IST 2018
                  SOURCE: /Users/brigita/Dev/test/homepage-1.0/app/views/index.scala.html
                  HASH: af06018d9d2598ab03676ee2171e3b40ae9b0982
                  MATRIX: 745->2|857->19|885->22|905->34|944->36|976->43|990->49|1043->82|1075->85
                  LINES: 27->2|32->2|34->4|34->4|34->4|36->6|36->6|36->6|38->8
                  -- GENERATED --
              */
          