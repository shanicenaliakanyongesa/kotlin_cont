from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader
    # Create your views here.
def home(request):
    template = loader.get_template('home.html')
    return HttpResponse(template.render())
        #return HttpResponse("Hello World")
 def players(request):
    template = loader.get_template('players.html')
    return HttpResponse(template.render())
          