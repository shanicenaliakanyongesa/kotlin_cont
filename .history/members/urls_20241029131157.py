#from django.urls import path: This imports the path function from Django's URL module, which is used to define URL patterns.
#
from django.urls import path
from . import views
urlpatterns = [path('home/', views.home, name='home'),

    ]