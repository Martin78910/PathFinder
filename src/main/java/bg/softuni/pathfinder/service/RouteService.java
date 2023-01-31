package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.model.Route;
import bg.softuni.pathfinder.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {


    private RouteRepository routeRepositiry;

    @Autowired
    public RouteService(RouteRepository routeRepositiry) {
        this.routeRepositiry = routeRepositiry;
    }

    public List<Route> getMostComemented() {
        return routeRepositiry.findMostCommented();

    }
}
