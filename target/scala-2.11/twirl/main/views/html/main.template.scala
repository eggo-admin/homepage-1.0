
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head><!-- Global site tag (gtag.js) - Google Analytics -->
        <script async src="https://www.googletagmanager.com/gtag/js?id=UA-116990360-1"></script>
        <script>
                window.dataLayer = window.dataLayer || [];
                function gtag()"""),format.raw/*10.32*/("""{"""),format.raw/*10.33*/("""dataLayer.push(arguments);"""),format.raw/*10.59*/("""}"""),format.raw/*10.60*/("""
                """),format.raw/*11.17*/("""gtag('js', new Date());

                gtag('config', 'UA-116990360-1');
        </script>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        """),format.raw/*18.34*/("""
        """),format.raw/*19.9*/("""<title>Eggo Egg</title>

        <link rel="apple-touch-icon" sizes="57x57" href=""""),_display_(/*21.59*/routes/*21.65*/.Assets.at("images/favicon/apple-icon-57x57.png")),format.raw/*21.114*/("""">
        <link rel="apple-touch-icon" sizes="60x60" href=""""),_display_(/*22.59*/routes/*22.65*/.Assets.at("/images/favicon/apple-icon-60x60.png")),format.raw/*22.115*/("""">
        <link rel="apple-touch-icon" sizes="72x72" href=""""),_display_(/*23.59*/routes/*23.65*/.Assets.at("images/favicon/apple-icon-72x72.png")),format.raw/*23.114*/("""">
        <link rel="apple-touch-icon" sizes="76x76" href=""""),_display_(/*24.59*/routes/*24.65*/.Assets.at("images/favicon/apple-icon-76x76.png")),format.raw/*24.114*/("""">
        <link rel="apple-touch-icon" sizes="114x114" href=""""),_display_(/*25.61*/routes/*25.67*/.Assets.at("images/favicon/apple-icon-114x114.png")),format.raw/*25.118*/("""">
        <link rel="apple-touch-icon" sizes="120x120" href=""""),_display_(/*26.61*/routes/*26.67*/.Assets.at("images/favicon/apple-icon-120x120.png")),format.raw/*26.118*/("""">
        <link rel="apple-touch-icon" sizes="144x144" href=""""),_display_(/*27.61*/routes/*27.67*/.Assets.at("images/favicon/apple-icon-144x144.png")),format.raw/*27.118*/("""">
        <link rel="apple-touch-icon" sizes="152x152" href=""""),_display_(/*28.61*/routes/*28.67*/.Assets.at("images/favicon/apple-icon-152x152.png")),format.raw/*28.118*/("""">
        <link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*29.61*/routes/*29.67*/.Assets.at("images/favicon/apple-icon-180x180.png")),format.raw/*29.118*/("""">
        <link rel="icon" type="image/png" sizes="192x192"  href=""""),_display_(/*30.67*/routes/*30.73*/.Assets.at("images/favicon/android-icon-192x192.png")),format.raw/*30.126*/("""">
        <link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*31.64*/routes/*31.70*/.Assets.at("images/favicon/favicon-32x32.png")),format.raw/*31.116*/("""">
        <link rel="icon" type="image/png" sizes="96x96" href=""""),_display_(/*32.64*/routes/*32.70*/.Assets.at("images/favicon/favicon-96x96.png")),format.raw/*32.116*/("""">
        <link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*33.64*/routes/*33.70*/.Assets.at("images/favicon/favicon-16x16.png")),format.raw/*33.116*/("""">
        <link rel="manifest" href=""""),_display_(/*34.37*/routes/*34.43*/.Assets.at("images/favicon/manifest.json")),format.raw/*34.85*/("""">
        <meta name="msapplication-TileColor" content="#ffffff">
        <meta name="msapplication-TileImage" content="/ms-icon-144x144.png">
        <meta name="theme-color" content="#ffffff">
        <script src=""""),_display_(/*38.23*/routes/*38.29*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*38.74*/("""" type="text/javascript"></script>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link href="https://fonts.googleapis.com/css?family=Lato:300,600,900" rel="stylesheet">
            <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
            <!-- CSS -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*44.54*/routes/*44.60*/.Assets.at("stylesheets/main.css")),format.raw/*44.94*/("""">

            <!--	Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Rock+Salt" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">


        <script>
                (function(h,e,a,t,m,p) """),format.raw/*52.40*/("""{"""),format.raw/*52.41*/("""
                    """),format.raw/*53.21*/("""m=e.createElement(a);m.async=!0;m.src=t;
                    p=e.getElementsByTagName(a)[0];p.parentNode.insertBefore(m,p);
                """),format.raw/*55.17*/("""}"""),format.raw/*55.18*/(""")(window,document,'script','https://u.heatmap.it/log.js');
        </script>
    </head>
    <body>
            <!--	navigation-->
        <nav class="navbar navbar-toggleable-sm navbar-expand-md navbar-light py-4">
            <div class="container">
                <button class="navbar-toggler ml-auto" data-toggle="collapse" data-target="#mainNav">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="mainNav">
                    <div class="navbar-nav ml-auto">
                        <a class="nav-item nav-link ml-auto" href="#about">About</a>
                        <a class="nav-item nav-link ml-auto" href="#team">The Team</a>
                        <a class="nav-item nav-link ml-auto" href="#contact">Contact</a>
                    </div>
                </div>
            </div>
        </nav>
            <!--	end of navigation-->

        <div class="jumbotron jumbotron-fluid text-center pb-0">


            <div class="container">
                <div class="row justify-content-center m-4 p-4">
                    <img src=""""),_display_(/*82.32*/routes/*82.38*/.Assets.at("images/eggo-logo-web.png")),format.raw/*82.76*/("""" alt="Eggo Egg">

                </div>
                <div class="text-center m-5 p-2 ff-rock-salt">
                    <p class="h5 text-muted">Disconnected.</p>
                </div>
                <img class="m-5" src=""""),_display_(/*88.40*/routes/*88.46*/.Assets.at("images/triangle-25x25.png")),format.raw/*88.85*/("""">
            </div>

            <div class="container">

                <p class="h3 p-3 pb-0 mt-4 mb-0 text-dark" id="about">About</p>
                <div class="underline"></div>
                <p class="lead text-justify mt-5 mb-4">Eggo is the first holdable device of its kind that was designed with accessibility and simplicity in mind. It is the perfect tool to help parents introduce their children to the magic of mindfulness. </p>

                <img class="m-5" src=""""),_display_(/*97.40*/routes/*97.46*/.Assets.at("images/triangle-25x25.png")),format.raw/*97.85*/("""">
            </div>

            <div class="container" id="team">
                <p class="h3 p-3 pb-0 mt-4 mb-0 text-dark">The Team</p>
                <div class="underline mb-4"></div>
                <div>
                    <div class="row  d-flex d-flex justify-content-center flex-row text-muted">
                        <div class="col-sm-12 col-md-6 col-lg-4 mt-5">
                            <img src=""""),_display_(/*106.40*/routes/*106.46*/.Assets.at("images/S.jpg")),format.raw/*106.72*/("""" alt="Steve" class="rounded-circle border m-2">
                            <p class="h5 mt-2">Steve Cullen</p>
                            <p class="sub-text mt-0">Founder</p>

                        </div>
                        <div class="col-sm-12 col-md-6 col-lg-4 mt-5">
                            <img src=""""),_display_(/*112.40*/routes/*112.46*/.Assets.at("images/B.jpg")),format.raw/*112.72*/("""" alt="Brigita" class="rounded-circle border m-2">
                            <p class="h5 mt-2">Brigita Usman</p>
                            <p class="sub-text mt-0">Product Manager</p>

                        </div>

                        <div class="col-sm-12 col-md-6 col-lg-4 mt-5">
                            <img src=""""),_display_(/*119.40*/routes/*119.46*/.Assets.at("images/su.jpg")),format.raw/*119.73*/("""" alt="Stephen" class="rounded-circle m-2">
                            <p class="h5 mt-2">Steven Underwood</p>
                            <p class="sub-text mt-0">Electronic Engineer</p>

                        </div>
                        <div class="col-sm-12 col-md-6 col-lg-4 mt-5">
                            <img src=""""),_display_(/*125.40*/routes/*125.46*/.Assets.at("images/M.jpg")),format.raw/*125.72*/("""" alt="Mart" class="rounded-circle border m-2">
                            <p class="h5 mt-2">Mart McNamara</p>
                            <p class="sub-text mt-0">Electronic Engineer</p>
                        </div>


                        <div class="col-sm-12 col-lg-4 mt-5">
                            <img src=""""),_display_(/*132.40*/routes/*132.46*/.Assets.at("images/C.jpg")),format.raw/*132.72*/("""" alt="Colette" class="rounded-circle m-2">
                            <p class="h5 mt-2">Colette Maher</p>
                            <p class="sub-text mt-0">Finance & HR</p>

                        </div>
                    </div>
                    <div class="row text-muted">

                    </div>
                </div>
            </div>
            <img class="m-5" src=""""),_display_(/*143.36*/routes/*143.42*/.Assets.at("images/triangle-25x25.png")),format.raw/*143.81*/("""">
                <!--		end of team-->
        </div>


        <footer class="footer" id="contact" style="
            bottom: 0;
            width: 100%;
            line-height: 60px;">
            <div class="container text-center" style="">
                <div class="text-center pt-4">
                    <p class="h3 p-4 mb-0">Get in Touch</p>
                    <div class="underline mb-4"></div>
                </div>

                <div class="row justify-content-center">
                    <div>
                        <div class="d-flex p-4">
                            <img class="p-3 float-left" src=""""),_display_(/*161.63*/routes/*161.69*/.Assets.at("images/pin-web.png")),format.raw/*161.101*/("""" style="width:60px; height:68px">
                            <div class="align-self-center" style="line-height: 1.75;text-align:left; padding-left: 20px">46A Main Street, Leixlip, Co Kildare, Ireland</div>
                        </div>

                        <div class="d-flex p-4">
                            <img class="p-3 float-left" src=""""),_display_(/*166.63*/routes/*166.69*/.Assets.at("images/phone-web.png")),format.raw/*166.103*/("""" style="width:65px; height:65px">
                            <div class="align-self-center" style="line-height: 1.75;text-align:left; padding-left: 20px">+ 353 87 931 6555</div>
                        </div>

                        <div class="d-flex p-4">
                            <img class="p-3 float-left" src=""""),_display_(/*171.63*/routes/*171.69*/.Assets.at("images/email-web.png")),format.raw/*171.103*/("""" style="width:65px; height:65px">
                            <div class="align-self-center" style="line-height: 1.75;text-align:left; padding-left: 20px">hello@eggoegg.com</div>

                        </div>
                    </div>

                </div>
                <div class="col-sm py-4" style="font-size:12px; color:#969FAA">&copy Eggo 2018</div>
            </div>
        </footer>

            <!-- Optional JavaScript -->
            <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue May 22 12:25:23 IST 2018
                  SOURCE: /Users/brigita/Dev/test/app/views/main.scala.html
                  HASH: 932c1ab813ea6ef75e46b624c7195bceb3a929c1
                  MATRIX: 748->1|873->31|901->33|1221->325|1250->326|1304->352|1333->353|1378->370|1616->605|1652->614|1762->697|1777->703|1848->752|1936->813|1951->819|2023->869|2111->930|2126->936|2197->985|2285->1046|2300->1052|2371->1101|2461->1164|2476->1170|2549->1221|2639->1284|2654->1290|2727->1341|2817->1404|2832->1410|2905->1461|2995->1524|3010->1530|3083->1581|3173->1644|3188->1650|3261->1701|3357->1770|3372->1776|3447->1829|3540->1895|3555->1901|3623->1947|3716->2013|3731->2019|3799->2065|3892->2131|3907->2137|3975->2183|4041->2222|4056->2228|4119->2270|4364->2488|4379->2494|4445->2539|4998->3065|5013->3071|5068->3105|5370->3379|5399->3380|5448->3401|5616->3541|5645->3542|6819->4689|6834->4695|6893->4733|7150->4963|7165->4969|7225->5008|7738->5494|7753->5500|7813->5539|8261->5959|8277->5965|8325->5991|8673->6311|8689->6317|8737->6343|9097->6675|9113->6681|9162->6708|9521->7039|9537->7045|9585->7071|9937->7395|9953->7401|10001->7427|10421->7819|10437->7825|10498->7864|11153->8491|11169->8497|11224->8529|11603->8880|11619->8886|11676->8920|12027->9243|12043->9249|12100->9283
                  LINES: 27->1|32->1|34->3|41->10|41->10|41->10|41->10|42->11|49->18|50->19|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|69->38|69->38|69->38|75->44|75->44|75->44|83->52|83->52|84->53|86->55|86->55|113->82|113->82|113->82|119->88|119->88|119->88|128->97|128->97|128->97|137->106|137->106|137->106|143->112|143->112|143->112|150->119|150->119|150->119|156->125|156->125|156->125|163->132|163->132|163->132|174->143|174->143|174->143|192->161|192->161|192->161|197->166|197->166|197->166|202->171|202->171|202->171
                  -- GENERATED --
              */
          