from django.urls import path
from . import viewsurlpatterns = [
        path('home/', views.home, name='home'),

    ]