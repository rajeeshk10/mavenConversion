package grails3.maven.version

import grails.converters.JSON

class LoginController {
    static responseFormats = ['json']


    def index() {
        render "The application is working"
    }

    def world() {
        render "Hello World!"
    }
}
