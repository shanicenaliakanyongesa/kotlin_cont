from django.urls import pathfrom . import views

    urlpatterns = [
        path('home/', views.home, name='home'),

    ]